
package net.mcreator.integratedmagic.client.particle;

@OnlyIn(Dist.CLIENT)
public class VortexParticleParticle extends TextureSheetParticle {

	public static VortexParticleParticleProvider provider(SpriteSet spriteSet) {
		return new VortexParticleParticleProvider(spriteSet);
	}

	public static class VortexParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public VortexParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new VortexParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected VortexParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 2f;

		this.lifetime = (int) Math.max(1, 60 + (this.random.nextInt(80) - 40));

		this.gravity = 0f;
		this.hasPhysics = true;

		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;

		this.angularVelocity = 1f;
		this.angularAcceleration = -0.02f;

		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();

		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;

	}

}
